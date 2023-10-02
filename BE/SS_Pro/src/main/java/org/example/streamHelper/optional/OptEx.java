package org.example.streamHelper.optional;

import java.util.Optional;

public class OptEx {
    public static void main(String[] args) {
        /**
         * Класс Optional является контейнером, предназначенным для обработки
         * потенциально отсутствующих значений. Он был введен в Java 8 для
         * предоставления более явной и безопасной обработки возможных null значений.
         *
         * Преимущества использования Optional:
         *
         * Избегание ошибок NullPointerException: Optional обеспечивает защиту
         * от случайного обращения к null значению, позволяя явно указать,
         * что значение может отсутствовать.
         * Улучшение читаемости кода: Использование Optional делает код более
         * понятным и выразительным, так как указывает на возможное отсутствие
         * значения и обязательность проверки этого условия.
         * Поощрение явной обработки возможного отсутствующего значения:
         * Optional требует явной проверки наличия значения перед его использованием,
         * что помогает снизить возможность ошибок и ясно указать на возможное отсутствие значения.
         */


        /**
         * В этом примере мы создаем Optional объект с непустым значением "John".
         * Затем мы проверяем наличие значения с помощью isPresent().
         * Если значение присутствует, мы его получаем с помощью get()
         * и выполняем соответствующие действия.
         */

        Optional<String> optionalName = Optional.of("John");
        if (optionalName.isPresent()) {
            String name = optionalName.get();
            System.out.println("Name: " + name);
        } else {
            System.out.println("Name is not available");
        }

        /**
         * Здесь мы создаем Optional объект на основе возвращаемого
         * значения метода getName(). Если значение присутствует, мы его получаем.
         * В противном случае, если значение отсутствует, мы используем значение
         * по умолчанию "Unknown", указанное в методе orElse().
         */

        Optional<String> optionalName1 = Optional.ofNullable(null);
        String name = optionalName.orElse("Unknown");
        System.out.println("Name: " + name);


        /**
         * Самое частое использование Optional связано с возвращаемыми значениями методов,
         * которые могут вернуть null, а также с обработкой значений из сторонних источников,
         * где значение может быть отсутствующим.
         *
         * Несмотря на преимущества Optional, следует помнить о некоторых его минусах:
         *
         * Введение Optional может увеличить сложность кода в некоторых случаях,
         * особенно если требуется последовательное выполнение операций.
         * Использование Optional требует дополнительных проверок наличия значения
         * и вызовов методов, что может привести к небольшому снижению производительности.
         */
    }
}