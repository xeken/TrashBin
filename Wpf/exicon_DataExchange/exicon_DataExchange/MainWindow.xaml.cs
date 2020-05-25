using System;
using System.Windows;
using System.Windows.Controls;

namespace exicon_DataExchange
{
    /// <summary>
    /// MainWindow.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ListBox_SelectionChanged(object sender, System.Windows.Controls.SelectionChangedEventArgs e)
        {
            ListBoxItem lbi = ((sender as ListBox).SelectedItem as ListBoxItem);
            Console.WriteLine("   You selected " + lbi.Content.ToString() + ".");
        }
    }
}
