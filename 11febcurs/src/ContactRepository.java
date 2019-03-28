import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    class	ContactRepository {
        String file;

        ContactRepository(String file) {
            this.file = file;
        }

        void saveContact(String name, String email) {
            String row = name + "," + email + "\n";
            writeRow(row);
        }

        void writeRow(String row) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
                out.write(row);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void main(String[] args) {
           /** try {*/
                ContactRepository repo = new ContactRepository("D:\\file.csv");
                repo.saveContact("Adrian", "123");
            } /**catch (java.lang.Exception e) {
                System.out.println("an exception00");
                e.printStackTrace();
            }*/
        }

