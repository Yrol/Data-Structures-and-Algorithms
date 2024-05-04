package arrays.array;


public class MyArray {

    private final Object[] data;

    private final int length;
    public int cursor = 0;

    public MyArray(int length) {
        this.length = length;
        data = new Object[length];
    }

    public Object get(int index) {
        return this.data[index];
    }

    public Object[] getAll() {
        Object[] allData = new Object[cursor];
        if (cursor > 0) {
            for(int i = 0; i < data.length; i++){
                if(data[i] != null){
                    allData[i] = data[i];
                }
            }
        }
        return allData;
    }

    public void push(Object value) {
        if (cursor < length) {
            this.data[cursor] = value;
            cursor++;
        }
    }

    public void pop() {
        if (cursor != 0) {
            data[cursor - 1] = null;
            cursor--;
            System.out.println("Cursor:" + cursor);
        }
    }

    public void delete(int index) {

        if (index < data.length && index <= cursor - 1) {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            cursor--;
        }
    }
}
