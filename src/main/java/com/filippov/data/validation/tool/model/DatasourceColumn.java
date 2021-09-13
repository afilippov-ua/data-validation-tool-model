/*
 *   Copyright 2018-2020 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.filippov.data.validation.tool.model;

import java.io.Serializable;

public class DatasourceColumn implements Serializable {
    private String tableName;
    private String name;
    private DataType dataType;

    public DatasourceColumn() {
    }

    public DatasourceColumn(String tableName, String name, DataType dataType) {
        this.tableName = tableName;
        this.name = name;
        this.dataType = dataType;
    }

    public static DatasourceColumnBuilder builder() {
        return new DatasourceColumnBuilder();
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public static class DatasourceColumnBuilder {
        private String tableName;
        private String name;
        private DataType dataType;

        DatasourceColumnBuilder() {
        }

        public DatasourceColumnBuilder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DatasourceColumnBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DatasourceColumnBuilder dataType(DataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public DatasourceColumn build() {
            return new DatasourceColumn(tableName, name, dataType);
        }
    }
}