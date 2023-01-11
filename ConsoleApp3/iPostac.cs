using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    public interface iPostac
    {
        string Imie { get; set; }
        double PZ { get; set; }
        double MocAtaku();
        double ZmienZywotnosc(double x);
    }
}
