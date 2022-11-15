using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.OleDb;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        OleDbConnection conn = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=E:\Sports.accdb");
        public Form1()
        {
            InitializeComponent();
            
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox10.Text = textBox5.Text;
            textBox10.Enabled = false;
            
           // OleDbConnection conn = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\delll\Documents\Sports.accdb");
            OleDbCommand comm1 = new OleDbCommand("insert into team values('"+textBox1.Text +"','"+textBox2.Text +"','"+textBox3.Text +"','"+textBox4.Text +"','"+textBox5.Text +"')");
            OleDbCommand comm2 = new OleDbCommand("insert into athlete values('" + textBox6.Text + "','" + textBox7.Text + "','" + textBox8.Text + "','" + textBox5.Text + "')");
            conn.Open();
            comm1.Connection = conn;
            comm1.ExecuteNonQuery();
            comm2.Connection = conn;
            comm2.ExecuteNonQuery();
            conn.Close();
            

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            textBox10.Enabled = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            listBox2.Items.Clear();
            OleDbDataReader r;
            OleDbCommand comm3 = new OleDbCommand("select *from team");
            conn.Open();
            comm3.Connection = conn;
            r=comm3.ExecuteReader();

            while (r.Read())
            {
                listBox1.Items.Add(r[0] + "      " + r[1] +"     "+ r[2] +"     "+ r[3]+"    " + r[4]);
            }
            r.Close();
            OleDbDataReader r1;
            OleDbCommand comm4 = new OleDbCommand("select *from athlete");
            
            comm4.Connection = conn;
            r1 = comm4.ExecuteReader();

            while (r1.Read())
            {
                listBox2.Items.Add(r1[0] + "      " + r1[1] + "     " + r1[2]+"   "+r1[3] );
            }

            conn.Close();
        }
    }
}

