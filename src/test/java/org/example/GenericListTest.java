package org.example;

import org.junit.jupiter.api.Test;

public class GenericListTest {

    @Test
    public void shouldVerifyIntegerInList() {
        //given
        GenericList<Integer> listInt = new GenericList<>();
        listInt.add(7);
        listInt.add(3);
        listInt.add(1);
        listInt.add(9);
        listInt.add(2);
        listInt.add(5);

        for (int i = 0; i < listInt.size(); i++) {
            System.out.print("get[" + i + "]-" + listInt.get(i) + " ");
        }
        System.out.print("\nget[10] : ");
        try {
            System.out.println(listInt.get(10));
        } catch (Exception e) {
            e.getMessage();
            System.out.println("- this index does not exist");
        }

        //when
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i) + " ");
        }
        System.out.println("\nsize : " + listInt.size());

        System.out.println("remove el \"3\" : " + listInt.remove(3));
        System.out.println("remove el \"5\" : " + listInt.remove(5));
        System.out.println("remove el \"10\" : " + listInt.remove(10));

        //then
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i) + " ");
        }
        System.out.println("\nsize : " + listInt.size());
    }

    @Test
    public void shouldVerifyStringInList() {
        //given
        GenericList<String> listString = new GenericList<>();
        listString.add("Daniel");
        listString.add("Steve");
        listString.add("Brian");
        listString.add("Gary");
        listString.add("Larry");
        listString.add("Jack");

        for (int i = 0; i < listString.size(); i++) {
            System.out.print("get[" + i + "]-" + listString.get(i) + " ");
        }
        System.out.print("\nget[10] : ");
        try {
            System.out.println(listString.get(10));
        } catch (Exception e) {
            e.getMessage();
            System.out.println("- this index does not exist");
        }

        //when
        for (int i = 0; i < listString.size(); i++) {
            System.out.print(listString.get(i) + " ");
        }
        System.out.println("\nsize : " + listString.size());

        System.out.println("remove el \"Gary\" : " + listString.remove("Gary"));
        System.out.println("remove el \"Jack\" : " + listString.remove("Jack"));
        System.out.println("remove el \"Frank\" : " + listString.remove("Frank"));

        //then
        for (int i = 0; i < listString.size(); i++) {
            System.out.print(listString.get(i) + " ");
        }
        System.out.println("\nsize : " + listString.size());
    }

    @Test
    public void shouldVerifyDoubleInList() {
        //given
        GenericList<Double> listDouble = new GenericList<>();
        listDouble.add(3.0);
        listDouble.add(5.0);
        listDouble.add(2.0);
        listDouble.add(9.0);
        listDouble.add(4.0);
        listDouble.add(7.0);

        for (int i = 0; i < listDouble.size(); i++) {
            System.out.print("get[" + i + "]-" + listDouble.get(i) + " ");
        }
        System.out.print("\nget[10] : ");
        try {
            System.out.println(listDouble.get(10));
        } catch (Exception e) {
            e.getMessage();
            System.out.println("- this index does not exist");
        }

        //when
        for (int i = 0; i < listDouble.size(); i++) {
            System.out.print(listDouble.get(i) + " ");
        }
        System.out.println("\nsize : " + listDouble.size());

        System.out.println("remove el \"3.0\" : " + listDouble.remove(3.0));
        System.out.println("remove el \"9.0\" : " + listDouble.remove(9.0));
        System.out.println("remove el \"10.0\" : " + listDouble.remove(10.0));

        //then
        for (int i = 0; i < listDouble.size(); i++) {
            System.out.print(listDouble.get(i) + " ");
        }
        System.out.println("\nsize : " + listDouble.size());
    }

}
