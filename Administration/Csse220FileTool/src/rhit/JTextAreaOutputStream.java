package rhit;

import java.io.OutputStream;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

class JTextAreaOutputStream extends OutputStream {
    private final JTextArea textArea;

    public JTextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        appendText(String.valueOf((char) b));
    }

    @Override
    public void write(byte[] b, int off, int len) {
        appendText(new String(b, off, len));
    }

    private void appendText(String text) {
        SwingUtilities.invokeLater(() -> textArea.append(text));
    }
}
