public class Client {
    DataStorage dataStorage;

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void storeData(){
        dataStorage.store();
    }
}
