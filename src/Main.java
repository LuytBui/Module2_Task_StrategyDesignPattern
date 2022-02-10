public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.setDataStorage(new CsvStorage());
        client.storeData();

        client.setDataStorage(new SqlStorage());
        client.storeData();
    }
}
