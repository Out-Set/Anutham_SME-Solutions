import javax.swing.JOptionPane;

public class WordCount {
    public static void main(String[] args) throws Exception {
        
        while(true){
        String s = JOptionPane.showInputDialog("Please enter a sentence.");
        if(s.equalsIgnoreCase("stop")){
            break;
        }
        int numberOfUpperE = 0;
        int numberOfLowerE = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'E')
                numberOfUpperE++;
            else if(ch == 'e')
                numberOfLowerE++;
        }
        JOptionPane.showMessageDialog(null, "Number of lower case e's:"+numberOfLowerE+"\n"+"Number of upper case e's:"+numberOfUpperE);
        }
    }
}
