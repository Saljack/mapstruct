/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.conversion.precedence;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = IntegerStringMapper.class)
public interface SourceTargetMapper {

    SourceTargetMapper INSTANCE = Mappers.getMapper( SourceTargetMapper.class );

    Target sourceToTarget(Source source);

    Source targetToSource(Target target);
}
