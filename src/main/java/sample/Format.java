package sample;

public  enum Format { // todo нужно всё сделать большими буквами,добавить поле и для каждого значения передавать его знач
    AVI(".avi"),
    MKV(".mkv"),
    CAM(".cam"),
    SCR(".scr");

    private String name;

    Format(String name) {
        this.name=name;
    }

    public  String toString(){
        return  name;
    }

}
