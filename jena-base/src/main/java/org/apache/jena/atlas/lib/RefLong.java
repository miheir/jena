/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.atlas.lib;

public final class RefLong
{
    private long value ;
    public RefLong()                { this(0) ; }
    public RefLong(long v)          { value = v ; }
    public long value()             { return value ; }
    public void inc()               { value++ ; } 
    public void dec()               { --value ; }
    public long getAndInc()         { return value++ ; }
    public long incAndGet()         { return ++value ; }
    public long getAndDec()         { return value-- ; }
    public long decAndGet()         { return --value ; }
    public void add(long v)         { value += v ; }
    public void subtract(long v)    { value -= v ; }
    public void set(long v)         { value = v ; }
    @Override public String toString() { return "Ref:"+Long.toString(value) ; } 
    // hashCode and equals are Object equality - this is a mutable object
}
