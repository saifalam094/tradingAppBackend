package com.zosh.controller;

import com.zosh.modal.Asset;
import com.zosh.modal.User;
import com.zosh.service.AssetService;
import com.zosh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asset")
public class AssetController {
    @Autowired
    private AssetService assetService;
    @Autowired
    private UserService userService;
    @GetMapping("/coin/{coinId}/user")
public ResponseEntity<Optional<Asset>> getAssetById(@PathVariable Long assetId) throws Exception{
    Optional<Asset> asset=assetService.getAssetById(assetId);
    return ResponseEntity.ok().body(asset);
}
public ResponseEntity<Asset> getAssetByUserIdAndCoinId(@PathVariable String coinId, @RequestHeader("Authorization") String jwt) throws Exception {
    User user=userService.findUserProfileByJwt(jwt);
    Asset asset=assetService.findAssetByUserIdAndCoinId(user.getId(),coinId);
    return ResponseEntity.ok().body(asset);
}
public  ResponseEntity<List<Asset>> getAssetForUser(@RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserProfileByJwt(jwt);
        List<Asset> assets=assetService.getUsersAssets(user.getId());
        return ResponseEntity.ok().body(assets);
}

}
