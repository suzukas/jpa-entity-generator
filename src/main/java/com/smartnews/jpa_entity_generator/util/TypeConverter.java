package com.smartnews.jpa_entity_generator.util;

import com.smartnews.jpa_entity_generator.config.CodeGeneratorConfig;
import lombok.AllArgsConstructor;

import java.sql.Types;

/**
 * Utility to convert SQL types to Java types.
 */
@AllArgsConstructor
public class TypeConverter {

    private final CodeGeneratorConfig config;

    public String toJavaType(int typeCode) {
        switch (typeCode) {
            case Types.ARRAY:
                return "Array";
            case Types.BIGINT:
                return "Long";
            // case Types.BINARY:
            case Types.BIT:
                // return "Boolean";
                return "boolean";
            case Types.BLOB:
                return "Blob";
            case Types.BOOLEAN:
                return "Boolean";
            case Types.CHAR:
                return "String";
            case Types.CLOB:
                return "Clob";
            // case Types.DATALINK:
            case Types.DATE:
                return config.isUseJSR310() ? "LocalDate" : "Date";
            case Types.DECIMAL:
                return "java.math.BigDecimal";
            // case Types.DISTINCT:
            case Types.DOUBLE:
                return "Double";
            case Types.FLOAT:
                return "Float";
            case Types.INTEGER:
                return "Integer";
            // case Types.JAVA_OBJECT:
            // case Types.LONGNVARCHAR:
            // case Types.LONGVARBINARY:
            case Types.LONGVARCHAR:
                return "String";
            // case Types.NCHAR:
            // case Types.NCLOB:
            // case Types.NULL:
            case Types.NUMERIC:
                return "java.math.BigDecimal";
            // case Types.NVARCHAR:
            // case Types.OTHER:
            case Types.REAL:
                return "Float";
            case Types.REF:
                return "Ref";
            // case Types.REF_CURSOR:
            // case Types.ROWID:
            case Types.SMALLINT:
                return "Short";
            // case Types.SQLXML:
            case Types.STRUCT:
                return "Struct";
            case Types.TIME:
                return config.isUseJSR310() ? "LocalTime" : "Time";
            case Types.TIME_WITH_TIMEZONE:
                return config.isUseJSR310() ? "OffsetTime" : "Time";
            case Types.TIMESTAMP:
                return config.isUseJSR310() ? "LocalDateTime" : "Timestamp";
            case Types.TIMESTAMP_WITH_TIMEZONE:
                return config.isUseJSR310() ? "OffsetDateTime" : "Timestamp";
            case Types.TINYINT:
                return "Byte";
            // case Types.VARBINARY:
            case Types.VARCHAR:
                return "String";
            default:
                return "String";
        }
    }

    public String toPrimitiveTypeIfPossible(String type) {
        switch (type) {
            case "Byte":
                return "byte";
            case "Short":
                return "short";
            case "Integer":
                return "int";
            case "Long":
                return "long";
            case "Double":
                return "double";
            case "Float":
                return "float";
            case "Boolean":
                return "boolean";
            default:
                return type;
        }
    }
}
