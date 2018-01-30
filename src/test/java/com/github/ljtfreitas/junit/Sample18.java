package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sample18 {

    @ParameterizedTest
    @ExcelSource(file =  "test.xls")
    public void parameterizedTest(String argument) {
        assertNotNull(argument);
    }

    @ArgumentsSource(ExcelArgumentProvider.class)
    public @interface ExcelSource {

        String file();
    }

    static class ExcelArgumentProvider implements ArgumentsProvider, AnnotationConsumer<ExcelSource> {

        private String fileName;

        @Override
        public void accept(ExcelSource excelSource) {
            this.fileName = excelSource.file();
        }

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.empty();
        }
    }
}
