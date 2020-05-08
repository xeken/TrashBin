using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace currency_mvvm.ViewModel
{
    class CurrencyConverterViewModel : INotifyPropertyChangedImpl
    {
        private decimal dollars;
        public decimal Dollars
        {
            get { return this.dollars; }
            set
            {
                this.dollars = value;
                OnPropertyChanged("Dollars");
                OnDollarsChanged();
            }
        }

        private decimal wons;
        public decimal Wons
        {
            get { return this.wons; }
            set
            {
                this.wons = value;
                OnPropertyChanged("Wons");
            }
        }


        private void OnDollarsChanged()
        {
            Wons = Dollars * 1.2M;
        }
    }
}
