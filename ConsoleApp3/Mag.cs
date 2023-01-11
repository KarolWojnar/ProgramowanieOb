using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    public class Mag : iPostac
    {
        public string Imie { get; set; }
        public double PZ { get; set; }
        public double MocAtaku { get; set; }

        private int punkty_magii;
        private int sila;
        public Mag(string imie, double pZ, double mocAtaku, int punkty_magii, int sila)
        {
            Imie = imie;
            PZ = 100;
            this.punkty_magii = punkty_magii;
            this.sila = sila;
        }
        public Mag()
        {
            Imie = "Geralt";
            PZ = 100;
            Random rand = new Random();
            this.sila = rand.Next(6) + 1;
            this.punkty_magii = rand.Next(6) + 1;
            this.punkty_magii += rand.Next(6) + 1;

        }
        public double mocAtaku()
        {
            return (this.punkty_magii + this.sila) * PZ;
        }

        public override string ToString()
        {
            return "Mag: " + Imie +  "\tpunkty zycia: " + PZ + "%\t"
                + "Moc ataku: " + mocAtaku() + "\tpunkty magii: " + punkty_magii;
        }

        public double ZmienZywotnosc(double x)
        {
            PZ += x;
            if (PZ < 0) PZ = 0;
            if (PZ > 100) PZ = 100;
            return PZ;
        }

    }
}
