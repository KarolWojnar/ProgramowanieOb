using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    public class Wojownik: iPostac
    {
        private double sila;
        private int baseSila = 0;
        public string Imie { get; set; }
        public double PZ { get; set; }
        public double MocAtaku { get; set; }
        public Wojownik(double sila, string imie, double pZ)
        {
            this.sila = sila;
            Imie = imie;
            PZ = pZ;
        }

        public Wojownik()
        {
            Random rand = new Random();
            this.sila = rand.Next(6) + 1;
            this.sila += rand.Next(6) + 1;
            this.sila += rand.Next(6) + 1;
            baseSila = (int)this.sila;
            Imie = "Marian";
            PZ = 100;
        }

        public double mocAtaku()
        {
            if (PZ < 5) return baseSila;
            else return this.sila;
        }

        public override string ToString()
        {
            return "Wojownik: \t" + "Imie: " + Imie + "\tpunkty życia: " + this.PZ + "\tsila: " + mocAtaku(); 
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
