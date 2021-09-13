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

import java.util.List;

public class ColumnData {
    private String keyColumn;
    private String dataColumn;
    private List<Object> keys;
    private List<Object> values;

    public ColumnData() {
    }

    public ColumnData(String keyColumn, String dataColumn, List<Object> keys, List<Object> values) {
        this.keyColumn = keyColumn;
        this.dataColumn = dataColumn;
        this.keys = keys;
        this.values = values;
    }

    public static ColumnDataBuilder builder() {
        return new ColumnDataBuilder();
    }

    public String getKeyColumn() {
        return this.keyColumn;
    }

    public void setKeyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
    }

    public String getDataColumn() {
        return this.dataColumn;
    }

    public void setDataColumn(String dataColumn) {
        this.dataColumn = dataColumn;
    }

    public List<Object> getKeys() {
        return this.keys;
    }

    public void setKeys(List<Object> keys) {
        this.keys = keys;
    }

    public List<Object> getValues() {
        return this.values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public static class ColumnDataBuilder {
        private String keyColumn;
        private String dataColumn;
        private List<Object> keys;
        private List<Object> values;

        ColumnDataBuilder() {
        }

        public ColumnDataBuilder keyColumn(String keyColumn) {
            this.keyColumn = keyColumn;
            return this;
        }

        public ColumnDataBuilder dataColumn(String dataColumn) {
            this.dataColumn = dataColumn;
            return this;
        }

        public ColumnDataBuilder keys(List<Object> keys) {
            this.keys = keys;
            return this;
        }

        public ColumnDataBuilder values(List<Object> values) {
            this.values = values;
            return this;
        }

        public ColumnData build() {
            return new ColumnData(keyColumn, dataColumn, keys, values);
        }
    }
}
