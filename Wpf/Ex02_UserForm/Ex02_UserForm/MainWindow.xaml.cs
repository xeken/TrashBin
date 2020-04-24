using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Ex02_UserForm
{
    public partial class MainWindow : Window
    {
        public static ObservableCollection<User> users = new ObservableCollection<User>(); //How to send reference//how to receiv//how to use
        //private List<User> users = new List<User>();

        public MainWindow()
        {
            InitializeComponent();

            users.Add(new User() { Name = "John" });
            lstUsers.ItemsSource = users;
        }

        private void btnInsertUser_Click(object sender, RoutedEventArgs e)
        {
            AddUserForm window = new AddUserForm();
            window.ShowDialog();
        }

        private void btnModifyUser_Click(object sender, RoutedEventArgs e)
        {
            if (lstUsers.SelectedItem != null)
                (lstUsers.SelectedItem as User).Name = "Random Name";
        }

        private void btnDeleteUser_Click(object sender, RoutedEventArgs e)
        {
            if (lstUsers.SelectedItem != null)
                users.Remove(lstUsers.SelectedItem as User);
        }
    }
    
}
