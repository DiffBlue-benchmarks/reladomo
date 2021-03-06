
/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.finder.attribute;

import com.gs.fw.finder.Attribute;
import com.gs.fw.finder.Operation;

import java.util.Date;
import java.util.Set;

public interface DateAttribute<Owner> extends Attribute<Owner>
{
    public Operation<Owner> eq(Date value);

    public Operation<Owner> notEq(Date value);

    public Operation<Owner> greaterThan(Date value);

    public Operation<Owner> greaterThanEquals(Date value);

    public Operation<Owner> lessThan(Date value);

    public Operation<Owner> lessThanEquals(Date value);

    public Operation<Owner> in(Set<Date> dateSet);

    public Operation<Owner> notIn(Set<Date> dateSet);
}
