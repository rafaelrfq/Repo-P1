using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntidadesCarrera
{
    public class Juego
    {
        #region "Atributos"

        public Carrera Carrera { get; set; }
        public eEstadoJuego Estado { get; set; }
        #endregion

        #region "Enums"
        public enum eEstadoJuego
        {
            Iniciado,
            EnProceso,
            Terminado
        }
        #endregion

        #region "Comportamientos"
        public void Iniciar()
        {

        }

        public void Actualizar()
        {

        }

        public void Dibujar()
        {

        }
        #endregion
    }
}
