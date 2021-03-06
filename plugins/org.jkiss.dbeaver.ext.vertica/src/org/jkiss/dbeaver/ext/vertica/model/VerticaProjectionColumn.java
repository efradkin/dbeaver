/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2017 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.vertica.model;

import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

/**
 * VerticaProjectionColumn
 */
public class VerticaProjectionColumn extends JDBCTableColumn<VerticaProjection>
{

    protected VerticaProjectionColumn(VerticaProjection table, boolean persisted) {
        super(table, persisted);
    }

    protected VerticaProjectionColumn(VerticaProjection table, boolean persisted, String name, String typeName, int valueType, int ordinalPosition, long maxLength, Integer scale, Integer precision, boolean required, boolean autoGenerated, String defaultValue) {
        super(table, persisted, name, typeName, valueType, ordinalPosition, maxLength, scale, precision, required, autoGenerated, defaultValue);
    }

    protected VerticaProjectionColumn(VerticaProjection table, DBSEntityAttribute source, boolean persisted) {
        super(table, source, persisted);
    }

    @Override
    public DBPDataSource getDataSource() {
        return getTable().getDataSource();
    }
}
