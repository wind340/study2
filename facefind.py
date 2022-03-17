import matplotlib.pyplot as pit     #그림관련 라이브러리
import matplotlib.image as mpgimg   #사진관련 라이브러리

img = mpgimg.imread ('family22.jpg') #사진설정
pit.figure(figsize=(10,8))          
pit.imshow(img)
pit.show()

import json     #json형식 사용 key:value
import requests #인터넷연결

client_id = "FMDyhNmjPk4lbg_NfXpF"
client_secret = "IJPYsvn6Ad"

url = "https://openapi.naver.com/v1/vision/face" # 얼굴감지
files = {'image':open('family22.jpg', 'rb')}
headers = {'X-Naver-Client-Id': client_id, 'X-Naver-Client-Secret': client_secret }
response = requests.post(url,  files=files, headers=headers)
#print(response.text)    #객체 내부 보기

parsed = json.loads(response.text)
#print(parsed)   #딕셔너리로 보기

#print(json.dumps(parsed, indent=4, sort_keys = False, ensure_ascii=False))
#분석한 내용들 불러오기

# parsed['faces'][0]['age']          #0번째의 나이값
# parsed['faces'][0]['gender']      #성별
# parsed['faces'][0]['emotion']     #표정
parsed['faces'][0]['roi']           #좌표

# for each in parsed['faces']:
#     h,w,x,y = each['roi'].values()
#     gender, gen_confidence = each['gender'].values()
#     age, age_confidence = each['age'].values()
#     emotion, emo_confidence = each['emotion'].values()
#     print(gender + age)


import matplotlib.patches as patches
img = mpgimg.imread('family22.jpg')

fig, ax = pit.subplots(figsize=(10,10))
ax.imshow(img)

for each in parsed['faces']:
    h,w,x,y = each['roi'].values()
    gender, gen_confidence = each['gender'].values()
    age, age_confidence = each['age'].values()
    emotion, emo_confidence = each['emotion'].values()

    rect_face = patches.Rectangle((x,y),w,h, linewidth=5, edgecolor='r', facecolor='none')
    
    letter= gender+str(gen_confidence*100)[:5]+'%,\n'+emotion+str(emo_confidence*100)[:5]+'%,\n'+age+str(age_confidence*100)[:5]+'%'
    pit.text(x,y+h+50,letter,size=12,color='red')
    ax.add_patch(rect_face)
