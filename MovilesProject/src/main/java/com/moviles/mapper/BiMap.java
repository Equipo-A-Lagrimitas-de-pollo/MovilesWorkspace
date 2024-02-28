package com.moviles.mapper;

public interface BiMap<Entity,DTO> {
	public DTO mapToDto(Entity entity);
	public Entity mapToEntity(DTO dto);
}
