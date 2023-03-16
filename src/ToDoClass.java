import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.Reader;

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

    public JSONObject ToJson()
    {
        JSONObject json = new JSONObject();
        json.put("Title", this.GetTitle());
        json.put("Description", this.GetDesc());

        return json;
    }

    static public ToDoClass FromJson(Reader jsonData)
    {
        JSONParser parser = new JSONParser();
        try {
            JSONObject  jsonObj = (JSONObject) parser.parse(jsonData);
            String Title = (String) jsonObj.get("Title");
            String Description = (String) jsonObj.get("Description");

            return new ToDoClass(Title, Description);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            return null;
        }
    }

}
