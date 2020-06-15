package homework_7.trelloboard.lists;

public class ListRequest {

    private String name;
    private String idBoard;


    public ListRequest(String name, String idBoard) {
        this.name = name;
        this.idBoard = idBoard;
    }

    public String getName() {
        return name;
    }

    public String getIdBoard() {
        return idBoard;
    }

    @Override
    public String toString() {
        return "ListRequest{" +
                "name='" + name + '\'' +
                ", idBoard='" + idBoard + '\'' +
                '}';
    }


}
