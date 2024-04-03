package com.example.myapplication

import javax.swing.JFrame
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem

class MainFrame : JFrame("Currency Converter") {
    init {
        setSize(300, 200)
        defaultCloseOperation = EXIT_ON_CLOSE

        val menuBar = JMenuBar()
        jMenuBar = menuBar

        val menu = JMenu("Menu")
        menuBar.add(menu)

        val inputItem = JMenuItem("Input").apply {
            addActionListener { CurrencyConverter.showInputDialog(this@MainFrame) }
        }
        val aboutItem = JMenuItem("About").apply {
            addActionListener { AboutDialog.showDialog(this@MainFrame) }
        }
        val exitItem = JMenuItem("Exit").apply {
            addActionListener { System.exit(0) }
        }

        menu.add(inputItem)
        menu.add(aboutItem)
        menu.add(exitItem)
    }
}
