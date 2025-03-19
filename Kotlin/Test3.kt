import javax.swing.JOptionPane
fun main(){
    val n1 = JOptionPane.showInputDialog ("Digite a primeira nota:")!!.toInt()
    val n2 = JOptionPane.showInputDialog ("Digite a segunda nota:")!!.toInt()
    val n3 = JOptionPane.showInputDialog ("Digite a terceira nota:")!!.toInt()
    val n4 = JOptionPane.showInputDialog ("Digite a quarta nota:")!!.toInt()
    val media = (n1+n2+n3+n4)/4
    JOptionPane.showMessageDialog(null,"O valor da sua média é igual á: $media")
    if (media >= 7){
        JOptionPane.showMessageDialog(null, "Parabéns, você passou!")
    }
    else{
        JOptionPane.showMessageDialog(null, "Você não passou...")
    }
}