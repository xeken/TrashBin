using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Windows;
using System.Windows.Controls;

namespace exicon_DataExchange
{
    public partial class MainWindow : Window
    {

        private ArrayList _wordList1 = new ArrayList() { "Hello", "World", "Fox", "Jumps over", "Rabbit" };
        private ArrayList _wordList2 = new ArrayList() { "Howdy", "Hero" };

        public MainWindow()
        {
            InitializeComponent();
            this.lstLeft.ItemsSource = _wordList1;
            this.lstRight.ItemsSource = _wordList2;
        }

        private void MoveToRight_Click(object sender, RoutedEventArgs e)
        {
            this.lstRight.Items.Add(this.lstLeft.SelectedValue.ToString());
            if (_wordList1 != null)
                _wordList1.RemoveAt(this.lstLeft.SelectedIndex);
            ApplyDataBinding();
        }

        private void MoveToLeft_Click(object sender, RoutedEventArgs e)
        {
            _wordList1.Add(this.lstRight.SelectedValue.ToString());
            lstRight.Items.RemoveAt(lstRight.Items.IndexOf(lstRight.SelectedItem));
            ApplyDataBinding();
        }

        private void ApplyDataBinding()
        {
            this.lstLeft.ItemsSource = null;
            this.lstLeft.ItemsSource = _wordList1;
        }
    }
}
