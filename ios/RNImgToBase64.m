
#import "RNImgToBase64.h"

@implementation RNImgToBase64

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

#pragma mark getBase64String
RCT_EXPORT_METHOD(getBase64String:(NSURL*)url callback:(RCTResponseSenderBlock)callback) {
    dispatch_async(dispatch_queue_create("image_processing", 0), ^{
        NSData* data = [NSData dataWithContentsOfURL:url];
        dispatch_async(dispatch_get_main_queue(), ^{
            callback(@[[NSNull null], [data base64EncodedStringWithOptions:0]]);
        });
    });
}

@end
  