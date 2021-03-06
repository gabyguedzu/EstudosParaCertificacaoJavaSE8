package util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        // generics
        LinkedList<Conta> lista = new LinkedList<Conta>();

        ContaCorrente cc = new ContaCorrente(11, 22);
        lista.add(cc);
        ContaCorrente cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        System.out.println(lista.size());

        Conta ref =  lista.get(0);
        System.out.println(ref.getNumero());

    }

}
