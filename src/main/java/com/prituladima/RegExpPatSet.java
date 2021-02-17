package com.prituladima;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public class RegExpPatSet  implements Set<String> {

    Pattern pattern;

    public RegExpPatSet(String regExp) {
        this.pattern = Pattern.compile(regExp);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return pattern.matcher(o.toString()).matches();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {

        Set<String> emails = new RegExpPatSet("[a-zA-Z_0-9]{1,1}[a-zA-Z_0-9.!]{1,35}@([a-z]{2,5}\\.){1,5}[a-z]{2,10}");

        System.out.println(emails.contains("prituladima@gmail.com"));
        go(emails);
    }

    private static void go(Set<String> emails) {

    }


}
