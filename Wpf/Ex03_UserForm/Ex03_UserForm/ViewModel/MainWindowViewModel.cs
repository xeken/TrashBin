using Ex03_Form.Model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Windows.Input;

namespace Ex03_UserForm.ViewModel
{
    class MainWindowViewModel
    {
        private IList<User> _UserList;

        public MainWindowViewModel()
        {
            _UserList = new List<User>
            {
                new User{UserId = 1,FirstName="John",LastName="Doe",City="Daegu", Country="RUSSIA"},
                new User{UserId = 2,FirstName="Jane",LastName="Doe",City="Busan", Country="USA"},
                new User{UserId = 3,FirstName="Chris",LastName="Lee",City="Seoul", Country="USA"},
                new User{UserId = 4,FirstName="James",LastName="kim",City="Jeju", Country="JAPAN"},
                new User{UserId = 5,FirstName="Kenn",LastName="Jo",City="WG", Country="KOREA"}
            };
        }

        public IList<User> Users
        {
            get { return this._UserList; }
            set { this._UserList = value; }
        }

        private ICommand mUpdater;
        public ICommand UpdateCommand
        {
            get { 
                if (mUpdater == null) 
                    this.mUpdater = new Updater();
                return this.mUpdater;
            }
            set { this.mUpdater = value; }
        }

        private class Updater : ICommand
        {
            public event EventHandler CanExecuteChanged;
            public bool CanExecute(object parameter) {return true;}
            public void Execute(object parameter){}
        }
    }
   
}
