package com.mbrlabs.mundus.core.kryo.descriptors;

import java.util.ArrayList;
import java.util.List;
import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;

/**
 * @author Marcus Brummer
 * @version 17-12-2015
 */
public class ProjectDescriptor {

    @Tag(0)
    private List<ModelDescriptor> models;
    @Tag(1)
    private List<TerrainDescriptor> terrains;
    @Tag(2)
    private List<SceneDescriptor> scenes;
    @Tag(3)
    private long currentSceneID;
    @Tag(4)
    private String name;
    @Tag(5)
    private String id;
    @Tag(6)
    private long nextAvailableID;

    public ProjectDescriptor() {
        models = new ArrayList<>();
        terrains = new ArrayList<>();
        scenes = new ArrayList<>();
    }

    public List<ModelDescriptor> getModels() {
        return models;
    }

    public List<TerrainDescriptor> getTerrains() {
        return terrains;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNextAvailableID() {
        return nextAvailableID;
    }

    public void setNextAvailableID(long nextAvailableID) {
        this.nextAvailableID = nextAvailableID;
    }

    public List<SceneDescriptor> getScenes() {
        return scenes;
    }

    public long getCurrentSceneID() {
        return currentSceneID;
    }

    public void setCurrentSceneID(long currentSceneID) {
        this.currentSceneID = currentSceneID;
    }

}
