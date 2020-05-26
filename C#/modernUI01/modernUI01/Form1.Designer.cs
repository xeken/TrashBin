namespace modernUI01
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.pnlSlide = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.btnShutDown = new System.Windows.Forms.Button();
            this.btnIndex4 = new System.Windows.Forms.Button();
            this.btnChangeScreenSize = new System.Windows.Forms.Button();
            this.btnIndex3 = new System.Windows.Forms.Button();
            this.btnIndex2 = new System.Windows.Forms.Button();
            this.btnIndex1 = new System.Windows.Forms.Button();
            this.btnFoldDock = new System.Windows.Forms.Button();
            this.pnlIndex1 = new System.Windows.Forms.Panel();
            this.pnlIndex2 = new System.Windows.Forms.Panel();
            this.pnlIndex3 = new System.Windows.Forms.Panel();
            this.pnlIndex4 = new System.Windows.Forms.Panel();
            this.userControl11 = new modernUI01.UserControl1();
            this.userControl41 = new modernUI01.UserControl4();
            this.userControl31 = new modernUI01.UserControl3();
            this.userControl21 = new modernUI01.UserControl2();
            this.pnlSlide.SuspendLayout();
            this.SuspendLayout();
            // 
            // pnlSlide
            // 
            this.pnlSlide.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left)));
            this.pnlSlide.BackColor = System.Drawing.Color.DimGray;
            this.pnlSlide.Controls.Add(this.pnlIndex4);
            this.pnlSlide.Controls.Add(this.pnlIndex3);
            this.pnlSlide.Controls.Add(this.pnlIndex2);
            this.pnlSlide.Controls.Add(this.pnlIndex1);
            this.pnlSlide.Controls.Add(this.label1);
            this.pnlSlide.Controls.Add(this.btnShutDown);
            this.pnlSlide.Controls.Add(this.btnIndex4);
            this.pnlSlide.Controls.Add(this.btnChangeScreenSize);
            this.pnlSlide.Controls.Add(this.btnIndex3);
            this.pnlSlide.Controls.Add(this.btnIndex2);
            this.pnlSlide.Controls.Add(this.btnIndex1);
            this.pnlSlide.Controls.Add(this.btnFoldDock);
            this.pnlSlide.Location = new System.Drawing.Point(0, 0);
            this.pnlSlide.Margin = new System.Windows.Forms.Padding(0);
            this.pnlSlide.Name = "pnlSlide";
            this.pnlSlide.Size = new System.Drawing.Size(150, 720);
            this.pnlSlide.TabIndex = 5;
            // 
            // label1
            // 
            this.label1.Location = new System.Drawing.Point(0, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(100, 23);
            this.label1.TabIndex = 0;
            // 
            // btnShutDown
            // 
            this.btnShutDown.Anchor = System.Windows.Forms.AnchorStyles.Bottom;
            this.btnShutDown.BackColor = System.Drawing.Color.Transparent;
            this.btnShutDown.FlatAppearance.BorderSize = 0;
            this.btnShutDown.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnShutDown.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnShutDown.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnShutDown.ForeColor = System.Drawing.Color.White;
            this.btnShutDown.Image = ((System.Drawing.Image)(resources.GetObject("btnShutDown.Image")));
            this.btnShutDown.Location = new System.Drawing.Point(100, 675);
            this.btnShutDown.Margin = new System.Windows.Forms.Padding(0);
            this.btnShutDown.Name = "btnShutDown";
            this.btnShutDown.Size = new System.Drawing.Size(50, 50);
            this.btnShutDown.TabIndex = 4;
            this.btnShutDown.UseVisualStyleBackColor = false;
            this.btnShutDown.Click += new System.EventHandler(this.ShutDown_Click);
            // 
            // btnIndex4
            // 
            this.btnIndex4.BackColor = System.Drawing.Color.DarkGray;
            this.btnIndex4.FlatAppearance.BorderSize = 0;
            this.btnIndex4.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnIndex4.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnIndex4.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnIndex4.ForeColor = System.Drawing.Color.White;
            this.btnIndex4.Image = global::modernUI01.Properties.Resources.outline_widgets_black_24dp;
            this.btnIndex4.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnIndex4.Location = new System.Drawing.Point(5, 280);
            this.btnIndex4.Margin = new System.Windows.Forms.Padding(0);
            this.btnIndex4.Name = "btnIndex4";
            this.btnIndex4.Size = new System.Drawing.Size(145, 50);
            this.btnIndex4.TabIndex = 5;
            this.btnIndex4.Text = "Index4";
            this.btnIndex4.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnIndex4.UseVisualStyleBackColor = false;
            this.btnIndex4.Click += new System.EventHandler(this.Index_Click);
            // 
            // btnChangeScreenSize
            // 
            this.btnChangeScreenSize.Anchor = System.Windows.Forms.AnchorStyles.Bottom;
            this.btnChangeScreenSize.BackColor = System.Drawing.Color.Transparent;
            this.btnChangeScreenSize.FlatAppearance.BorderSize = 0;
            this.btnChangeScreenSize.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnChangeScreenSize.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnChangeScreenSize.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnChangeScreenSize.ForeColor = System.Drawing.Color.White;
            this.btnChangeScreenSize.Image = global::modernUI01.Properties.Resources.outline_fullscreen_white_24dp;
            this.btnChangeScreenSize.Location = new System.Drawing.Point(50, 675);
            this.btnChangeScreenSize.Margin = new System.Windows.Forms.Padding(0);
            this.btnChangeScreenSize.Name = "btnChangeScreenSize";
            this.btnChangeScreenSize.Size = new System.Drawing.Size(50, 50);
            this.btnChangeScreenSize.TabIndex = 3;
            this.btnChangeScreenSize.UseVisualStyleBackColor = false;
            this.btnChangeScreenSize.Click += new System.EventHandler(this.ChangeScreenSize_Click);
            // 
            // btnIndex3
            // 
            this.btnIndex3.BackColor = System.Drawing.Color.DarkGray;
            this.btnIndex3.FlatAppearance.BorderSize = 0;
            this.btnIndex3.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnIndex3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnIndex3.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnIndex3.ForeColor = System.Drawing.Color.White;
            this.btnIndex3.Image = global::modernUI01.Properties.Resources.outline_widgets_black_24dp;
            this.btnIndex3.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnIndex3.Location = new System.Drawing.Point(5, 230);
            this.btnIndex3.Margin = new System.Windows.Forms.Padding(0);
            this.btnIndex3.Name = "btnIndex3";
            this.btnIndex3.Size = new System.Drawing.Size(145, 50);
            this.btnIndex3.TabIndex = 1;
            this.btnIndex3.Text = "Index3";
            this.btnIndex3.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnIndex3.UseVisualStyleBackColor = false;
            this.btnIndex3.Click += new System.EventHandler(this.Index_Click);
            // 
            // btnIndex2
            // 
            this.btnIndex2.BackColor = System.Drawing.Color.DarkGray;
            this.btnIndex2.FlatAppearance.BorderSize = 0;
            this.btnIndex2.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnIndex2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnIndex2.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnIndex2.ForeColor = System.Drawing.Color.White;
            this.btnIndex2.Image = global::modernUI01.Properties.Resources.outline_widgets_black_24dp;
            this.btnIndex2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnIndex2.Location = new System.Drawing.Point(5, 180);
            this.btnIndex2.Margin = new System.Windows.Forms.Padding(0);
            this.btnIndex2.Name = "btnIndex2";
            this.btnIndex2.Size = new System.Drawing.Size(145, 50);
            this.btnIndex2.TabIndex = 1;
            this.btnIndex2.Text = "Index2";
            this.btnIndex2.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnIndex2.UseVisualStyleBackColor = false;
            this.btnIndex2.Click += new System.EventHandler(this.Index_Click);
            // 
            // btnIndex1
            // 
            this.btnIndex1.BackColor = System.Drawing.Color.DimGray;
            this.btnIndex1.FlatAppearance.BorderSize = 0;
            this.btnIndex1.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.btnIndex1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnIndex1.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnIndex1.ForeColor = System.Drawing.Color.White;
            this.btnIndex1.Image = global::modernUI01.Properties.Resources.outline_widgets_black_24dp;
            this.btnIndex1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnIndex1.Location = new System.Drawing.Point(5, 130);
            this.btnIndex1.Margin = new System.Windows.Forms.Padding(0);
            this.btnIndex1.Name = "btnIndex1";
            this.btnIndex1.Size = new System.Drawing.Size(145, 50);
            this.btnIndex1.TabIndex = 0;
            this.btnIndex1.Text = "Index1";
            this.btnIndex1.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnIndex1.UseVisualStyleBackColor = false;
            this.btnIndex1.Click += new System.EventHandler(this.Index_Click);
            // 
            // btnFoldDock
            // 
            this.btnFoldDock.Anchor = System.Windows.Forms.AnchorStyles.Bottom;
            this.btnFoldDock.BackColor = System.Drawing.Color.Transparent;
            this.btnFoldDock.FlatAppearance.BorderSize = 0;
            this.btnFoldDock.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Gray;
            this.btnFoldDock.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnFoldDock.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnFoldDock.ForeColor = System.Drawing.Color.White;
            this.btnFoldDock.Image = ((System.Drawing.Image)(resources.GetObject("btnFoldDock.Image")));
            this.btnFoldDock.Location = new System.Drawing.Point(0, 675);
            this.btnFoldDock.Margin = new System.Windows.Forms.Padding(0);
            this.btnFoldDock.Name = "btnFoldDock";
            this.btnFoldDock.Size = new System.Drawing.Size(50, 50);
            this.btnFoldDock.TabIndex = 2;
            this.btnFoldDock.UseVisualStyleBackColor = false;
            this.btnFoldDock.Click += new System.EventHandler(this.FoldDock_Click);
            // 
            // pnlIndex1
            // 
            this.pnlIndex1.BackColor = System.Drawing.Color.Black;
            this.pnlIndex1.Location = new System.Drawing.Point(0, 130);
            this.pnlIndex1.Margin = new System.Windows.Forms.Padding(0);
            this.pnlIndex1.Name = "pnlIndex1";
            this.pnlIndex1.Size = new System.Drawing.Size(5, 50);
            this.pnlIndex1.TabIndex = 6;
            // 
            // pnlIndex2
            // 
            this.pnlIndex2.BackColor = System.Drawing.Color.DimGray;
            this.pnlIndex2.Location = new System.Drawing.Point(0, 180);
            this.pnlIndex2.Margin = new System.Windows.Forms.Padding(0);
            this.pnlIndex2.Name = "pnlIndex2";
            this.pnlIndex2.Size = new System.Drawing.Size(5, 50);
            this.pnlIndex2.TabIndex = 7;
            // 
            // pnlIndex3
            // 
            this.pnlIndex3.BackColor = System.Drawing.Color.DimGray;
            this.pnlIndex3.Location = new System.Drawing.Point(0, 230);
            this.pnlIndex3.Margin = new System.Windows.Forms.Padding(0);
            this.pnlIndex3.Name = "pnlIndex3";
            this.pnlIndex3.Size = new System.Drawing.Size(5, 50);
            this.pnlIndex3.TabIndex = 7;
            // 
            // pnlIndex4
            // 
            this.pnlIndex4.BackColor = System.Drawing.Color.DimGray;
            this.pnlIndex4.Location = new System.Drawing.Point(0, 280);
            this.pnlIndex4.Margin = new System.Windows.Forms.Padding(0);
            this.pnlIndex4.Name = "pnlIndex4";
            this.pnlIndex4.Size = new System.Drawing.Size(5, 50);
            this.pnlIndex4.TabIndex = 7;
            // 
            // userControl11
            // 
            this.userControl11.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.userControl11.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.userControl11.Location = new System.Drawing.Point(50, 0);
            this.userControl11.Margin = new System.Windows.Forms.Padding(0);
            this.userControl11.Name = "userControl11";
            this.userControl11.Size = new System.Drawing.Size(1230, 720);
            this.userControl11.TabIndex = 1;
            // 
            // userControl41
            // 
            this.userControl41.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.userControl41.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.userControl41.Location = new System.Drawing.Point(50, 0);
            this.userControl41.Margin = new System.Windows.Forms.Padding(0);
            this.userControl41.Name = "userControl41";
            this.userControl41.Size = new System.Drawing.Size(1230, 720);
            this.userControl41.TabIndex = 4;
            this.userControl41.Visible = false;
            // 
            // userControl31
            // 
            this.userControl31.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.userControl31.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.userControl31.Location = new System.Drawing.Point(50, 0);
            this.userControl31.Margin = new System.Windows.Forms.Padding(0);
            this.userControl31.Name = "userControl31";
            this.userControl31.Size = new System.Drawing.Size(1230, 720);
            this.userControl31.TabIndex = 3;
            this.userControl31.Visible = false;
            // 
            // userControl21
            // 
            this.userControl21.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.userControl21.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.userControl21.Location = new System.Drawing.Point(50, 0);
            this.userControl21.Name = "userControl21";
            this.userControl21.Size = new System.Drawing.Size(1230, 720);
            this.userControl21.TabIndex = 2;
            this.userControl21.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1280, 720);
            this.Controls.Add(this.pnlSlide);
            this.Controls.Add(this.userControl11);
            this.Controls.Add(this.userControl41);
            this.Controls.Add(this.userControl31);
            this.Controls.Add(this.userControl21);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.Text = "Form1";
            this.pnlSlide.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button btnIndex1;
        private System.Windows.Forms.Button btnIndex2;
        private System.Windows.Forms.Button btnIndex3;
        private System.Windows.Forms.Button btnIndex4;
        private System.Windows.Forms.Button btnShutDown;
        private System.Windows.Forms.Button btnChangeScreenSize;
        private System.Windows.Forms.Button btnFoldDock;
        private UserControl1 userControl11;
        private UserControl2 userControl21;
        private UserControl3 userControl31;
        private UserControl4 userControl41;
        private System.Windows.Forms.Panel pnlSlide;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel pnlIndex4;
        private System.Windows.Forms.Panel pnlIndex3;
        private System.Windows.Forms.Panel pnlIndex2;
        private System.Windows.Forms.Panel pnlIndex1;
    }
}

