package com.zosh.service;

import com.zosh.modal.Asset;
import com.zosh.modal.Coin;
import com.zosh.modal.User;

import java.util.List;
import java.util.Optional;

public interface AssetService {
    Asset createAsset(User user, Coin coin, double quantity);
    Optional<Asset> getAssetById(Long assetId);
    Asset getAssetByUserIdAndId(Long userId, Long assetId);
    List<Asset> getUsersAssets(Long userId);
    Asset updateAsset(Long assetId, double quantity);
    Asset findAssetByUserIdAndCoinId(Long userId, String coinId);
    void deleteAsset(Long assetId);

}
