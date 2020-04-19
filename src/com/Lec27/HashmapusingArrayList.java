//package com.Lec27;
//
//import com.linkedlist.LInkedClient;
//
//import javax.swing.text.html.parser.Entity;
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class HashmapusingArrayList {
//
//    ArrayList<LinkedList<Entity>> entities=new ArrayList<>();
//
//    public HashmapusingArrayList(){
//        for (int i = 0; i <100 ; i++) {
//
//     entities.add(new LinkedList<>());
//        }
//    }
//
//    public void put(String key,String value){
//
//        int hashcode =Math.abs(key.hashCode()%entities.size());
//
//        LinkedList<Entity> list=entities.get(hashcode);
//        for (Entity entity:list){
//            if(entity.key.equals(key)){
//                entity.value=value;
//                return;
//            }
//        }
//        list.add(new Entity(key, value));
//    }
//
//    public void get (String key){
//        int hashcode=Math.abs(key.hashCode()%entities.size());
//        LinkedList<Entity> list=entities.get(hashcode);
//        Entity target=
//        for(Entity entity:entities){
//
//    }
//
//    class Entity{
//
//        String key;
//        String value;
//
//        public Entity(String key,String value){
//            this.value=value;
//            this.key=key;
//        }
//    }
//
//}
