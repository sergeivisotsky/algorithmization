import javax.swing.*;

public class PictureButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String html = "<html>" +
                        "<table border=1>" +
                            "<tr>" +
                                "<td>One</td>" +
                                "<td>Two</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>Three</td>" +
                                "<td>Four</td>" +
                            "</tr>" +
                        "</table>" +
                "</html>";
        JButton button = new JButton(html);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}