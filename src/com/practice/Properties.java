package com.practice;

/**
 * Created by andrej on 06.07.17.
 */
public class Properties {

        public static void main(String[] args) {
            // Получение всех свойств.
            java.util.Properties properties = System.getProperties();
            // Вывод отдельного свойства по имени.
            String s  = properties.getProperty("os.name");
            String aS = properties.getProperty("os.version");
            System.out.print(s+aS);
            // Вывод всех свойств.
            //properties.list(System.out);

        }
    }

