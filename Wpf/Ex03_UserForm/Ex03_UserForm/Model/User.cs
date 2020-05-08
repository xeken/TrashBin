using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex03_Form.Model
{
    class User : INotifyPropertyChanged
    {
        private int userId;
        private string firstName;
        private string lastName;
        private string city;
        private string country;

        public int UserId
        {
            get { return this.userId; }
            set
            {
                this.userId = value;
                OnPropertyChanged("UserId");
            }
        }
        public string FirstName
        {
            get { return this.firstName; }
            set
            {
                this.firstName = value;
                OnPropertyChanged("FirstName");
            }
        }
        public string LastName
        {
            get { return this.lastName; }
            set
            {
                this.lastName = value;
                OnPropertyChanged("LastName");
            }
        }
        public string City
        {
            get { return this.city; }
            set
            {
                this.city = value;
                OnPropertyChanged("City");
            }
        }
        public string Country
        {
            get { return this.country; }
            set
            {
                this.country = value;
                OnPropertyChanged("Country");
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;
        private void OnPropertyChanged(string propertyName)
        {
            if (PropertyChanged != null)
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }
    }
}
