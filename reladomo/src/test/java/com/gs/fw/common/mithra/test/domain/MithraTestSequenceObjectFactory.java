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

package com.gs.fw.common.mithra.test.domain;
/*
 * File:        : $Source$
 *
 *
 *
 */

import com.gs.fw.common.mithra.MithraSequence;
import com.gs.fw.common.mithra.MithraSequenceObjectFactory;

public class MithraTestSequenceObjectFactory implements MithraSequenceObjectFactory
{
    public MithraSequence getMithraSequenceObject(String sequenceName, Object sourceAttribute, int initialValue)
    {
        String deskId = sourceAttribute == null ? "B" : sourceAttribute.toString();
        MithraTestSequence mithraTestSequence = MithraTestSequenceFinder.findOne(MithraTestSequenceFinder.sequenceName().eq(sequenceName).and(MithraTestSequenceFinder.deskId().eq(deskId)));
        if (mithraTestSequence == null)
        {
            mithraTestSequence = new MithraTestSequence();
            mithraTestSequence.setSequenceName(sequenceName);
            mithraTestSequence.setNextId(initialValue);
            mithraTestSequence.setDeskId(deskId);
            mithraTestSequence.insert();
        }
        return mithraTestSequence;
    }
}
