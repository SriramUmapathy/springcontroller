package action;import java.util.HashMap;import java.util.Map;public class TodoHelper {    public Map<String,Object> createTask (String type){        Map<String,Object> paramMap = new HashMap<>();        paramMap.put("status",true);        paramMap.put("type",type);        return paramMap;    }}