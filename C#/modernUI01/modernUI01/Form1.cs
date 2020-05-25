using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace modernUI01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Index_Click(object sender, EventArgs e)
        {
            this.userControl11.Visible = false;
            this.userControl21.Visible = false;
            this.userControl31.Visible = false;
            this.userControl41.Visible = false;

            this.btnIndex1.BackColor = Color.DarkGray;
            this.btnIndex2.BackColor = Color.DarkGray;
            this.btnIndex3.BackColor = Color.DarkGray;
            this.btnIndex4.BackColor = Color.DarkGray;

            Control ctrl = (Control)sender;
            switch (ctrl.Name.ToString())
            {
                case "btnIndex1":
                    this.userControl11.Visible = true;
                    this.btnIndex1.BackColor = Color.DimGray;
                    break;
                case "btnIndex2":
                    this.userControl21.Visible = true;
                    this.btnIndex2.BackColor = Color.DimGray;
                    break;
                case "btnIndex3":
                    this.userControl31.Visible = true;
                    this.btnIndex3.BackColor = Color.DimGray;
                    break;
                case "btnIndex4":
                    this.userControl41.Visible = true;
                    this.btnIndex4.BackColor = Color.DimGray;
                    break;
                default:
                    this.userControl11.Visible = true;
                    this.btnIndex1.BackColor = Color.DimGray;
                    break;
            }
        }

        private void ShutDown_Click(object sender, EventArgs e) => this.Close();

        private bool _isFullScreen;
        private void ChangeScreenSize_Click(object sender, EventArgs e)
        {
            if (_isFullScreen == false)
            {
                this._isFullScreen = true;
                this.WindowState = FormWindowState.Maximized;
            }
            else if (_isFullScreen == true)
            {
                this._isFullScreen = false;
                this.WindowState = FormWindowState.Normal;
            }
        }

        private bool _isDockFold = true;
        private void FoldDock_Click(object sender, EventArgs e)
        {
            if(_isDockFold == false)
            {
                _isDockFold = true;
                this.pnlMain.Hide();
                this.btnFoldDock.Image = Properties.Resources.outline_navigate_next_black_24dp;
            }
            else if(_isDockFold == true)
            {
                _isDockFold = false;
                this.pnlMain.Show();
                this.pnlMain.BringToFront();
                this.btnFoldDock.Image = Properties.Resources.outline_navigate_before_black_24dp;
            }
        }
    }
}
