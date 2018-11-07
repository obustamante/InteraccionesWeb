package co.edu.usc.interacciones.utiles;

public class Result {
    public static String OK_RESULT = "OK";
    public static String ERROR_RESULT = "ERROR";

    private String result;
    private Object results;
    private Object data;
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResults(Object results) {
        this.results = results;
    }
}



/*
results


    private String result;
    private Object data;
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

 */