package com.example.myapplication.ui.theme
import javax.swing.JOptionPane
import javax.swing.JFrame
class CurrencyConverter {

    object CurrencyConverter {
        private const val EURO_RATE = 0.013 // Example conversion rate
        private const val DOLLAR_RATE = 0.016 // Example conversion rate

        fun showInputDialog(parent: JFrame) {
            val rublesString = JOptionPane.showInputDialog(parent, "Enter amount in Rubles:")
            rublesString?.let {
                try {
                    val rubles = it.toDouble()
                    val euros = rubles * EURO_RATE
                    val dollars = rubles * DOLLAR_RATE
                    val message = "Amount in Euros: €%.2f\nAmount in Dollars: $%.2f".format(euros, dollars)
                    JOptionPane.showMessageDialog(parent, message, "Converted Amounts", JOptionPane.INFORMATION_MESSAGE)
                } catch (nfe: NumberFormatException) {
                    JOptionPane.showMessageDialog(parent, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE)
                }
            }
        }
    }

}