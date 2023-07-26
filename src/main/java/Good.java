public class Good {
    String name;
    double value;

    Good (String goodName, double goodValue){
        name = goodName;
        value = goodValue;
    }
    String listGoods= name;
    void listOfGoods (){
        listGoods=listGoods+name+"/n";
    }
}
