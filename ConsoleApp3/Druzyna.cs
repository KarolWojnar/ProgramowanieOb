
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    public class Druzyna: IEnumerable<iPostac>, ICloneable
    {
        private string nazwa;
        private List<iPostac> lista;

        public Druzyna(string nazwa, List<iPostac> lista)
        {
            this.nazwa = nazwa;
            this.lista = new List<iPostac>();
        }
        public Druzyna(string nazwa, IEnumerable<iPostac> postacie)
        {
            this.nazwa = nazwa;
            lista = new List<iPostac>(postacie);
        }
        IEnumerable IEnumerable.GetEnumerator()
        {
            return lista.GetEnumerator();
        }
        public IEnumerable<iPostac> GetEnumerator() {
            return lista.GetEnumerator();
        }
        public object Clone()
        {
            Druzyna c = new Druzyna(nazwa);
            foreach(iPostac postac in this)
            {
                c.Dodaj(postac.Clone() as iPostac);
            }
        }
        public void Dodaj(iPostac postac)
        {
            if (postac == null) throw new ArgumentNullException("BRAK LUDZIA");
            lista.Add(postac);
        }
        public iPostac this[int i]
        {
            get
            {
                if (i < 0 || i >= lista.Count) throw new IndexOutOfRangeException("Poza jestes essa");
                return lista[i];
            }
            set
            {
                if(i < 0 || i >= lista.Count) throw new IndexOutOfRangeException("Poza jestes essa");
                lista[i] = value;
            }
        }
        public double sumaAtaku()
        {
            double moc = 0;
            foreach(var postac in lista)
            {
                moc += postac.MocAtaku();
            }
            return moc;
        }

        public override string? ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.AppendLine("Druzyna: " + nazwa);
            sb.AppendLine("Suma ataku: " + sumaAtaku());
            foreach(iPostac t in lista)
            {
                sb.AppendLine(t.ToString());
            }
            return sb.ToString();
        }
    }
}
