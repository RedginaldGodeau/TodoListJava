
public class ToDoClass
{

    static int len_id = 0;


    private int id;
    private String Title;
    private String Description;

    public ToDoClass(String _title, String _description)
    {
        this.Title = _title;
        this.Description = _description;
        this.id = ToDoClass.len_id++;
    }

    public String GetTitle() // TITLE GETTER
    {
        return this.Title;
    }

    public void SetTitle(String value) // TITLE SETTER
    {
        this.Title = value;
    }

    public String GetDesc() // GETTER DESCRIPTION
    {
        return this.Description;
    }

    public void SetDesc(String value) // SETTER DESCRIPTION
    {
        this.Description = value;
    }

    public int GetId() // GETTER DESCRIPTION
    {
        return this.id;
    }
}
