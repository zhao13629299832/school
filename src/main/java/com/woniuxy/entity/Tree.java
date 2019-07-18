package com.woniuxy.entity;

public class Tree {
    private Integer treeId;

    private Integer treePid;

    private String treeName;

    private String treeFile;

    private String treeIcon;

    private Boolean treeIsdelete;

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }

    public Integer getTreePid() {
        return treePid;
    }

    public void setTreePid(Integer treePid) {
        this.treePid = treePid;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeFile() {
        return treeFile;
    }

    public void setTreeFile(String treeFile) {
        this.treeFile = treeFile;
    }

    public String getTreeIcon() {
        return treeIcon;
    }

    public void setTreeIcon(String treeIcon) {
        this.treeIcon = treeIcon;
    }

    public Boolean getTreeIsdelete() {
        return treeIsdelete;
    }

    public void setTreeIsdelete(Boolean treeIsdelete) {
        this.treeIsdelete = treeIsdelete;
    }
}