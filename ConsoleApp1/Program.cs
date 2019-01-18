using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EntidadesCarrera;

namespace ConsoleApp1
{
    class Program
    {
        public static Juego Juego { get; set; }

        static void Main(string[] args)
        {
            Juego = new Juego();
        }
    }
}
