package structural.composite;

public class CompositePattern {
    public static void main(String[] args) {
        // Files
        FileSystemComponent file1 = new FileLeaf("Resume.pdf");
        FileSystemComponent file2 = new FileLeaf("CoverLetter.docx");

        // Sub-folder
        FolderComposite subFolder = new FolderComposite("Job Applications");
        subFolder.addComponent(file1);
        subFolder.addComponent(file2);

        // Root folder
        FolderComposite root = new FolderComposite("My Documents");
        root.addComponent(subFolder);
        root.addComponent(new FileLeaf("Notes.txt"));

        // Show structure
        root.showDetails();
    }
}
