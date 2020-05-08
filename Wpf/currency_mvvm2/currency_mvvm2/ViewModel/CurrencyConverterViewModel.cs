using currency_mvvm2.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace currency_mvvm2.ViewModel
{
    class CurrencyConverterViewModel : INotifyPropertyChangedImpl
    {
        private decimal wons;
        public decimal Wons
        {
            get => this.wons; 
            set
            {
                this.wons = value;
                OnPropertyChanged("Wons");
                OnWonsChanged();
            }
        }

        private Currency selectedCurrency;
        public Currency SelectedCurrency
        {
            get => this.selectedCurrency; 
            set
            {
                this.selectedCurrency = value;
                OnPropertyChanged("SelectedCurrency");
                OnSelectedCurrencyChanged();
            }
        }

        private IEnumerable<Currency> currencies;
        public IEnumerable<Currency> Currencies
        {
            get => this.currencies; 
            set
            {
                this.currencies = value;
                OnPropertyChanged("Currnecies");
            }
        }

        private decimal converted;
        public decimal Converted
        {
            get => this.converted; 
            set
            {
                this.converted = value;
                OnPropertyChanged("Converted");
            }
        }

        private string resultText = "Converted";
        public string ResultText
        {
            get => this.resultText; 
            set
            {
                this.resultText = value;
                OnPropertyChanged("ResultText");
            }
        }

        private void OnSelectedCurrencyChanged() => ComputeConverted();
        private void OnWonsChanged() => ComputeConverted();
        private void ComputeConverted()
        {
            if (SelectedCurrency == null) return;
           
            Converted = Wons * SelectedCurrency.Rate;
            ResultText = "Amount in " + SelectedCurrency.Title;
        }

        public CurrencyConverterViewModel()
        {
            Currencies = new Currency[]
            {
                new Currency("US Dollar", 1.2M),
                new Currency("JP En", 1.1M)
            };
        }
    }
}
